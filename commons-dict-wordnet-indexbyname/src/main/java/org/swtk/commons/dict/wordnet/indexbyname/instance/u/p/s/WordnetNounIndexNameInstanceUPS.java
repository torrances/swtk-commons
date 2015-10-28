package org.swtk.commons.dict.wordnet.indexbyname.instance.u.p.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUPS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"upsala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08784679\"]}");
	add("{\"term\":\"upset\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00068990\", \"00349138\", \"04522739\", \"14075885\", \"00555887\", \"14426686\"]}");
	add("{\"term\":\"upsetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10760251\"]}");
	add("{\"term\":\"upshot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11430739\"]}");
	add("{\"term\":\"upside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08681092\"]}");
	add("{\"term\":\"upsilon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06849215\"]}");
	add("{\"term\":\"upstage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04522925\"]}");
	add("{\"term\":\"upstager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10760389\"]}");
	add("{\"term\":\"upstairs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04523024\"]}");
	add("{\"term\":\"upstart\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00439278\", \"10760525\", \"10760809\"]}");
	add("{\"term\":\"upstroke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06812446\"]}");
	add("{\"term\":\"upsurge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00365613\", \"07454840\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }