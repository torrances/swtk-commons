package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04659702\", \"10297825\", \"11981569\"]}");
	add("{\"term\":\"mumbai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08923840\"]}");
	add("{\"term\":\"mumble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07141960\"]}");
	add("{\"term\":\"mumbler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362274\"]}");
	add("{\"term\":\"mumbling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00280079\", \"07147342\"]}");
	add("{\"term\":\"mumbo jumbo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06624773\"]}");
	add("{\"term\":\"mumification necrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14337088\"]}");
	add("{\"term\":\"mummer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10338550\"]}");
	add("{\"term\":\"mummery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06621756\"]}");
	add("{\"term\":\"mummichog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01449780\"]}");
	add("{\"term\":\"mummification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00822244\", \"14337088\", \"14602179\"]}");
	add("{\"term\":\"mummy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05225904\", \"10297825\"]}");
	add("{\"term\":\"mumps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14161660\"]}");
	add("{\"term\":\"mumpsimus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05845038\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }