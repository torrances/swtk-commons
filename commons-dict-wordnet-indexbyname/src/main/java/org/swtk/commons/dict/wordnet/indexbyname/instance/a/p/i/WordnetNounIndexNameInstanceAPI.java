package org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"apia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09014122\"]}");
	add("{\"term\":\"apiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12950804\"]}");
	add("{\"term\":\"apiarist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09866163\"]}");
	add("{\"term\":\"apiary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02730351\"]}");
	add("{\"term\":\"apiculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00918116\"]}");
	add("{\"term\":\"apiculturist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09866163\"]}");
	add("{\"term\":\"apidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02210594\"]}");
	add("{\"term\":\"apios\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12527741\"]}");
	add("{\"term\":\"apis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02210795\"]}");
	add("{\"term\":\"apishamore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02730491\"]}");
	add("{\"term\":\"apium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12953924\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }