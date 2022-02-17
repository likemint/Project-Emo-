from django.db.models import Q
from django.shortcuts import render
from rest_framework.response import Response

from .models import Emoticon
# Create your views here.
from rest_framework.views import APIView

class Search(APIView):
    def get(self, request):
        Emoticons = Emoticon.objects.filter()
        context = {Emoticons.id : Emoticons.id, Emoticons.title : Emoticons.title, Emoticons.artist : Emoticons.artist, Emoticons.img : Emoticons.img}

        return render(request, "search/before_search.html", context=context)


class SearchWord(APIView):
    def term(self, request):
        # 키워드 입력 후 결과값 있음
        global Emoticons
        if 'term' in request.GET:
            query = request.GET.get('term')
            Emoticons = Emoticon.objects.filter(
                Q(Emoticons.title__icontains=query) |
                Q(Emoticons.artist__icontains=query) |
                Q(Emoticons.service__icontains=query) |
                Q(Emoticons.img__icontains=query) |
            )
        # 키워드 입력 후 결과 없음
        else:
            Not Found  Try Again

        context = {'query': query, 'Emoticons.id': Emoticons.id, 'Emoticons.title': Emoticons.title, 'Emoticons.artist': Emoticons.artist,
                   'Emoticons.img': Emoticons.img}

        return render(request, "search/after_search.html", context=context)