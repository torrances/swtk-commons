package org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"caiman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01701681\"]}");
	add("{\"term\":\"caimitillo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12794677\"]}");
	add("{\"term\":\"caimito\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12794411\"]}");
	add("{\"term\":\"cain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09610169\"]}");
	add("{\"term\":\"cainogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13466113\"]}");
	add("{\"term\":\"cairene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09906259\"]}");
	add("{\"term\":\"cairina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01855185\"]}");
	add("{\"term\":\"cairn\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02098829\", \"07288507\"]}");
	add("{\"term\":\"cairngorm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14718732\"]}");
	add("{\"term\":\"cairo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08918860\", \"09105526\"]}");
	add("{\"term\":\"caisson\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02940477\", \"02940621\", \"02940720\", \"03068446\"]}");
	add("{\"term\":\"caitiff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09906363\"]}");
	add("{\"term\":\"caitra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15244490\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }