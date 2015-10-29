package org.swtk.commons.dict.wordnet.indexbyname.instance.p.i.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pika\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02331081\"]}");
	add("{\"term\":\"pike\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02563739\", \"03941726\", \"03941974\", \"07795351\", \"03311555\"]}");
	add("{\"term\":\"pike perch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02560222\"]}");
	add("{\"term\":\"pikeblenny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02617112\"]}");
	add("{\"term\":\"piked reverse hang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00438159\"]}");
	add("{\"term\":\"piked whale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02068060\"]}");
	add("{\"term\":\"pikestaff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03942065\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }