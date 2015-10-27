package org.swtk.commons.dict.wordnet.index.name.instance.b.r.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bridal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01039501\"]}");
	add("{\"term\":\"bride\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09894191\", \"10883800\", \"09894084\"]}");
	add("{\"term\":\"bridecake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07648411\"]}");
	add("{\"term\":\"bridegroom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10167555\", \"10167455\"]}");
	add("{\"term\":\"bridesmaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09894328\"]}");
	add("{\"term\":\"bridge\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"02902540\", \"02902722\", \"02902852\", \"02902977\", \"00491580\", \"05606958\", \"13815542\", \"02903091\", \"02901994\"]}");
	add("{\"term\":\"bridgehead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08534288\", \"08706766\"]}");
	add("{\"term\":\"bridgeport\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09091412\"]}");
	add("{\"term\":\"bridges\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10883660\"]}");
	add("{\"term\":\"bridget\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10883800\"]}");
	add("{\"term\":\"bridgetown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08773497\"]}");
	add("{\"term\":\"bridgework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02902852\"]}");
	add("{\"term\":\"bridle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01148552\", \"02903443\"]}");
	add("{\"term\":\"bridoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02903877\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }