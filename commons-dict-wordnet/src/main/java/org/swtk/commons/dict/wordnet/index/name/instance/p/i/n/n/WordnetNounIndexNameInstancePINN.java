package org.swtk.commons.dict.wordnet.index.name.instance.p.i.n.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePINN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pinna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05331437\", \"13175183\"]}");
	add("{\"term\":\"pinnace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04416263\"]}");
	add("{\"term\":\"pinnacle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08637032\", \"13963489\", \"03949542\"]}");
	add("{\"term\":\"pinnatiped\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02078579\"]}");
	add("{\"term\":\"pinner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03949724\"]}");
	add("{\"term\":\"pinning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07243009\"]}");
	add("{\"term\":\"pinniped\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02078579\"]}");
	add("{\"term\":\"pinnipedia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02078379\"]}");
	add("{\"term\":\"pinnotheres\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01983112\"]}");
	add("{\"term\":\"pinnotheridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01982969\"]}");
	add("{\"term\":\"pinnule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13175183\"]}");
	add("{\"term\":\"pinny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03609613\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }