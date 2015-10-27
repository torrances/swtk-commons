package org.swtk.commons.dict.wordnet.index.name.instance.b.l.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBLAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"blatancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04714176\"]}");
	add("{\"term\":\"blather\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06622685\"]}");
	add("{\"term\":\"blatherskite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06622685\"]}");
	add("{\"term\":\"blatta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02236419\"]}");
	add("{\"term\":\"blattaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02235748\"]}");
	add("{\"term\":\"blattella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02237371\"]}");
	add("{\"term\":\"blattidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02236229\"]}");
	add("{\"term\":\"blattodea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02235748\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }