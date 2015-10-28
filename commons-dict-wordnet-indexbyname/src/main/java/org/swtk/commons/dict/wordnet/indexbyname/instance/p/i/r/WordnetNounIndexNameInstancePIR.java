package org.swtk.commons.dict.wordnet.indexbyname.instance.p.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"piracy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00751748\", \"00785181\"]}");
	add("{\"term\":\"pirana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02587080\"]}");
	add("{\"term\":\"pirandello\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11255777\"]}");
	add("{\"term\":\"piranga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01600192\"]}");
	add("{\"term\":\"piranha\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02587080\", \"10312833\"]}");
	add("{\"term\":\"pirate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03954164\", \"10455134\", \"10457029\"]}");
	add("{\"term\":\"pirogi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07640533\"]}");
	add("{\"term\":\"pirogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03259077\"]}");
	add("{\"term\":\"piroplasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01428275\"]}");
	add("{\"term\":\"piroshki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07640533\"]}");
	add("{\"term\":\"pirouette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00344556\"]}");
	add("{\"term\":\"piroxicam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03954317\"]}");
	add("{\"term\":\"pirozhki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07640533\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }