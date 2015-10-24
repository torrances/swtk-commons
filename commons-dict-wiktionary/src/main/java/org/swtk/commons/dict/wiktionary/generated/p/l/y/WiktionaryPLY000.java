package org.swtk.commons.dict.wiktionary.generated.p.l.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPLY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("plycount", "{\"term\":\"plycount\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|ply|count|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The total number of moves in a game, counting each player\u0027s move as 1\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004.\u0027\u0027 Jaap van den Herik, Hiroyuki Iida, Ernst A. Heinz. \u0027Advances in Computer Games: Many Games, Many Challenges...\u0027 Springer 2004, p. 216 [http://books.google.com/books?id\u003db1tMzog4M-MC\u0026amp;pg\u003dPA216\u0026amp;dq\u003dplycount\u0026amp;sig\u003dmT8CESvj8h9T-6Z45eQfcuItbQY\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Take note that if the side to move first wins, the \u0027\u0027plycount\u0027\u0027 must be an odd number, since that side makes the last move\", \"priority\":3}]}, \"synonyms\":{}}");

	add("plywood", "{\"term\":\"plywood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027ply\u0027 (lang\u003den) + \u0027wood\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Construction material supplied in sheets, and made of three or more layers of wood veneer glued together, laid up with alternating layers having their grain perpendicular to each other\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"After the hurricane there was a severe regional shortage of \u0027\u0027plywood\u0027\u0027, especially exterior \u0027\u0027plywood\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A specific grade or type of this construction material\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"We stock exterior \u0027\u0027plywoods\u0027\u0027, interior \u0027\u0027plywoods\u0027\u0027, and furniture \u0027\u0027plywoods\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }