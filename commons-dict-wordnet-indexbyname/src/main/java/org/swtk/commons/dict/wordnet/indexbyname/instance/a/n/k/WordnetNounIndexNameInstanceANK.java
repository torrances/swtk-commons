package org.swtk.commons.dict.wordnet.indexbyname.instance.a.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ankara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09063076\"]}");
	add("{\"term\":\"ankle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05586073\"]}");
	add("{\"term\":\"ankle brace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02715862\"]}");
	add("{\"term\":\"ankle bracelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02715956\"]}");
	add("{\"term\":\"ankle joint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05586073\"]}");
	add("{\"term\":\"anklebone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05278882\"]}");
	add("{\"term\":\"anklet\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02715956\", \"02716077\", \"02716223\"]}");
	add("{\"term\":\"anklets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02716077\"]}");
	add("{\"term\":\"ankus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02716355\"]}");
	add("{\"term\":\"ankyloglossia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14495695\"]}");
	add("{\"term\":\"ankylosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01704897\"]}");
	add("{\"term\":\"ankylosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01704897\"]}");
	add("{\"term\":\"ankylosing spondylitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14243956\"]}");
	add("{\"term\":\"ankylosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14045991\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }