from .views import Search
from django.urls import path

urlpatterns = [
    path('', Search.as_view()),
]