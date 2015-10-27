package org.swtk.commons.dict.wordnet.index.name.instance.v.e.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVEST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vest\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04230374\", \"04539168\"]}");
	add("{\"term\":\"vesta\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09494354\", \"09587306\"]}");
	add("{\"term\":\"vestal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10768472\"]}");
	add("{\"term\":\"vestibule\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05312102\", \"02718424\"]}");
	add("{\"term\":\"vestige\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06659391\"]}");
	add("{\"term\":\"vestiture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04539317\"]}");
	add("{\"term\":\"vestment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04539401\"]}");
	add("{\"term\":\"vestris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11385295\"]}");
	add("{\"term\":\"vestry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04539799\", \"08495862\"]}");
	add("{\"term\":\"vestryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10768557\"]}");
	add("{\"term\":\"vestrywoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10768672\"]}");
	add("{\"term\":\"vesture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03055525\", \"09494479\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }