package org.swtk.commons.dict.wordnet.indexbyname.instance.u.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"umbel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13151787\"]}");
	add("{\"term\":\"umbellales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12233714\"]}");
	add("{\"term\":\"umbellifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12951538\"]}");
	add("{\"term\":\"umbelliferae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12950804\"]}");
	add("{\"term\":\"umbellularia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11728137\"]}");
	add("{\"term\":\"umber\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04979718\", \"15107996\"]}");
	add("{\"term\":\"umbilical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05528130\"]}");
	add("{\"term\":\"umbilicus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05564228\"]}");
	add("{\"term\":\"umbo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05332101\"]}");
	add("{\"term\":\"umbra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14008583\"]}");
	add("{\"term\":\"umbrage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07532789\"]}");
	add("{\"term\":\"umbrella\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00383879\", \"00831579\", \"04514450\"]}");
	add("{\"term\":\"umbrellawort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11859929\"]}");
	add("{\"term\":\"umbria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08830584\"]}");
	add("{\"term\":\"umbrian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06974984\"]}");
	add("{\"term\":\"umbrina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02599518\"]}");
	add("{\"term\":\"umbundu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07008099\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }