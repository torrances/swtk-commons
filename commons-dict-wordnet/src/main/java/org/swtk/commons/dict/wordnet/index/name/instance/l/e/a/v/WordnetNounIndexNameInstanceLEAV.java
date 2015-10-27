package org.swtk.commons.dict.wordnet.index.name.instance.l.e.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"leave\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00053917\", \"06702859\", \"15164090\"]}");
	add("{\"term\":\"leaven\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05878029\", \"14958169\"]}");
	add("{\"term\":\"leavening\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14958169\", \"05878029\"]}");
	add("{\"term\":\"leaver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10024201\"]}");
	add("{\"term\":\"leaving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00043495\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }