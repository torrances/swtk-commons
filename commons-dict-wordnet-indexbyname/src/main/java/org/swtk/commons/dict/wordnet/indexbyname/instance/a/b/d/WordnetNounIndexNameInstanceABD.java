package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abdias\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06451382\", \"11231226\"]}");
	add("{\"term\":\"abdication\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06523753\", \"07269124\"]}");
	add("{\"term\":\"abdicator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774988\"]}");
	add("{\"term\":\"abdomen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05565978\", \"05564576\"]}");
	add("{\"term\":\"abdominal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05564972\"]}");
	add("{\"term\":\"abdominocentesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00945287\"]}");
	add("{\"term\":\"abdominoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00035498\"]}");
	add("{\"term\":\"abdominousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007129\"]}");
	add("{\"term\":\"abducens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05486760\"]}");
	add("{\"term\":\"abducent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05486760\"]}");
	add("{\"term\":\"abduction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00333863\", \"00776957\"]}");
	add("{\"term\":\"abductor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05298509\", \"10250498\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }