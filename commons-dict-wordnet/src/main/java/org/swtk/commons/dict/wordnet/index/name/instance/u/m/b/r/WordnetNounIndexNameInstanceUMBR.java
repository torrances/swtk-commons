package org.swtk.commons.dict.wordnet.index.name.instance.u.m.b.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUMBR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"umbra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14008583\"]}");
	add("{\"term\":\"umbrage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07532789\"]}");
	add("{\"term\":\"umbrella\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00383879\", \"00831579\", \"04514450\"]}");
	add("{\"term\":\"umbrellawort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11859929\"]}");
	add("{\"term\":\"umbria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08830584\"]}");
	add("{\"term\":\"umbrian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06974984\"]}");
	add("{\"term\":\"umbrina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02599518\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }