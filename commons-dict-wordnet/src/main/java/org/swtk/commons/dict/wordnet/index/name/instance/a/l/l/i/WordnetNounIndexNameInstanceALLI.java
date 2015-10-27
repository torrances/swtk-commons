package org.swtk.commons.dict.wordnet.index.name.instance.a.l.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALLI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12451383\"]}");
	add("{\"term\":\"alliance\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01083380\", \"06786485\", \"08310903\", \"13814395\", \"14442226\"]}");
	add("{\"term\":\"alliaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11890681\"]}");
	add("{\"term\":\"allice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02533630\"]}");
	add("{\"term\":\"allies\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08187877\", \"08188109\", \"08188491\"]}");
	add("{\"term\":\"alligator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01701075\", \"14784626\"]}");
	add("{\"term\":\"alligatorfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02650943\"]}");
	add("{\"term\":\"alligatoridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01700785\"]}");
	add("{\"term\":\"allionia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11858735\"]}");
	add("{\"term\":\"allioniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11856275\"]}");
	add("{\"term\":\"allis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02533630\"]}");
	add("{\"term\":\"alliteration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07111760\"]}");
	add("{\"term\":\"alliterator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09804005\"]}");
	add("{\"term\":\"allium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12451633\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }