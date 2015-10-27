package org.swtk.commons.dict.wordnet.index.name.instance.f.o.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFOLL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"follicle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05525745\"]}");
	add("{\"term\":\"folliculitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14369595\"]}");
	add("{\"term\":\"follies\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07033131\"]}");
	add("{\"term\":\"follower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10119893\", \"10119144\"]}");
	add("{\"term\":\"followers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08240184\"]}");
	add("{\"term\":\"following\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00320765\", \"08240184\"]}");
	add("{\"term\":\"followup\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00144071\", \"00456372\", \"03382428\"]}");
	add("{\"term\":\"folly\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00513854\", \"05655001\", \"01250622\", \"04898528\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }