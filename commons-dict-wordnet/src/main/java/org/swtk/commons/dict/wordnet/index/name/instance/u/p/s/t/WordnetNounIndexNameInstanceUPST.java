package org.swtk.commons.dict.wordnet.index.name.instance.u.p.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUPST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"upstage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04522925\"]}");
	add("{\"term\":\"upstager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10760389\"]}");
	add("{\"term\":\"upstairs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04523024\"]}");
	add("{\"term\":\"upstart\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00439278\", \"10760525\", \"10760809\"]}");
	add("{\"term\":\"upstroke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06812446\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }