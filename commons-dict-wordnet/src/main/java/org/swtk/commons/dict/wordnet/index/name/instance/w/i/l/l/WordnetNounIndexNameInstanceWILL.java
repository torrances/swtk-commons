package org.swtk.commons.dict.wordnet.index.name.instance.w.i.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWILL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"will\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06556133\", \"05992539\", \"05660438\"]}");
	add("{\"term\":\"willamette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09502765\"]}");
	add("{\"term\":\"willard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11407968\", \"11408136\"]}");
	add("{\"term\":\"willebrand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11408316\"]}");
	add("{\"term\":\"willet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02033491\"]}");
	add("{\"term\":\"willfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04915573\"]}");
	add("{\"term\":\"williams\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"11409476\", \"11409614\", \"11409896\", \"11410053\", \"11410165\", \"11410359\"]}");
	add("{\"term\":\"williamstown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09122003\"]}");
	add("{\"term\":\"willies\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07540498\"]}");
	add("{\"term\":\"willing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00163868\"]}");
	add("{\"term\":\"willingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04651869\"]}");
	add("{\"term\":\"willis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11410544\"]}");
	add("{\"term\":\"willow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04592080\", \"12745702\"]}");
	add("{\"term\":\"willowherb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12362816\"]}");
	add("{\"term\":\"willowware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04592230\"]}");
	add("{\"term\":\"willpower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04869236\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }