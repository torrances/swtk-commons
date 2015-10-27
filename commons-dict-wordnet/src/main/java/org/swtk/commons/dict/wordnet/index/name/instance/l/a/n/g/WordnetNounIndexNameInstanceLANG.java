package org.swtk.commons.dict.wordnet.index.name.instance.l.a.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLANG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"langbeinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14704043\"]}");
	add("{\"term\":\"lange\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11136456\"]}");
	add("{\"term\":\"langlaufer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10266014\"]}");
	add("{\"term\":\"langley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11136632\", \"13631114\"]}");
	add("{\"term\":\"langmuir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11136865\"]}");
	add("{\"term\":\"langobard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09722740\"]}");
	add("{\"term\":\"langouste\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01987336\", \"07809236\"]}");
	add("{\"term\":\"langoustine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07809497\"]}");
	add("{\"term\":\"langsat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12720061\"]}");
	add("{\"term\":\"langset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12720061\"]}");
	add("{\"term\":\"langside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01285882\"]}");
	add("{\"term\":\"langsyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15277446\"]}");
	add("{\"term\":\"langtry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11137098\"]}");
	add("{\"term\":\"language\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06315049\", \"05658665\", \"05816565\", \"07066015\", \"07123904\", \"06293304\"]}");
	add("{\"term\":\"languisher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10266092\"]}");
	add("{\"term\":\"languor\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04643310\", \"07499249\", \"11468109\", \"07531461\"]}");
	add("{\"term\":\"langur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02490922\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }