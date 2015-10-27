package org.swtk.commons.dict.wordnet.index.name.instance.s.u.r.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSURV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"surveillance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00653709\"]}");
	add("{\"term\":\"survey\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00883327\", \"06481365\", \"00645746\"]}");
	add("{\"term\":\"surveying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01007521\"]}");
	add("{\"term\":\"surveyor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10700243\", \"10700056\"]}");
	add("{\"term\":\"survival\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01024120\", \"13584949\", \"13985502\"]}");
	add("{\"term\":\"survivalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10700357\"]}");
	add("{\"term\":\"survivor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01326783\", \"10700507\", \"10700641\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }