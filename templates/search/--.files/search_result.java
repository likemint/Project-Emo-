pacakage search_emoticon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util ArrayList;




public ArrayList<searchemoticon> ggetList(String Emoticon, String searchType, String search, int pageNumber) {
    if(Emoticon.equals("이모티콘명")){
            Emoticon = "";
        }
        ArrayList<>;
        String Mysql = "";
        Connection conn = null;
        ResultSet rs = null;
        try{
            if(searchType.equls("가나다순")) {
                Mysql = "SELECT * FROM Emoticon WHERE Emoticon LIKE ? AND CONCAT(title, artist)"
                        "? ORDER BY title DESC LIMIT " + pageNumber * 15 ", " + pageNumber * 15 + 6;
            } else if(searchType.equls("좋아요순")) {
                Mysql = "SELECT * FROM Emoticon WHERE Emoticon LIKE ? AND CONCAT(title, artist)"
                        "? ORDER BY likecount DESC LIMIT " + pageNumber * 15 ", " + pageNumber * 15 + 6;
            }
            pstmt.setString(1, "%" + + "%")
            else if(searchType.equls("판매순")) {
                Mysql = "SELECT * FROM Emoticon WHERE Emoticon LIKE ? AND CONCAT(title, artist)"
                        "? ORDER BY title DESC LIMIT " + pageNumber * 15 ", " + pageNumber * 15 + 6;
            } else if(searchType.equls("최신순")) {
                Mysql = "SELECT * FROM Emoticon WHERE Emoticon LIKE ? AND CONCAT(title, artist)"
                        "? ORDER BY title DESC LIMIT " + pageNumber * 15 ", " + pageNumber * 15 + 6;
            }
        }
}