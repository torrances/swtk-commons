package org.swtk.commons.dict.wordnet.index.name.instance.r.e.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRETA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"retail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01116568\"]}");
	add("{\"term\":\"retailer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10545011\"]}");
	add("{\"term\":\"retailing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01118187\"]}");
	add("{\"term\":\"retainer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04089674\", \"10601606\", \"13344335\"]}");
	add("{\"term\":\"retake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00909990\"]}");
	add("{\"term\":\"retaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00097789\"]}");
	add("{\"term\":\"retaliation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01237823\"]}");
	add("{\"term\":\"retaliator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09845476\"]}");
	add("{\"term\":\"retama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12587821\"]}");
	add("{\"term\":\"retard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10217144\"]}");
	add("{\"term\":\"retardant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09431128\"]}");
	add("{\"term\":\"retardation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01069501\", \"05654063\", \"09431128\", \"15300584\", \"05068514\"]}");
	add("{\"term\":\"retarded\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07965557\"]}");
	add("{\"term\":\"retardent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09431128\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }