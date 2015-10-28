package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adrenal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05338719\"]}");
	add("{\"term\":\"adrenalectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00667350\"]}");
	add("{\"term\":\"adrenalin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05415731\"]}");
	add("{\"term\":\"adrenaline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05415731\"]}");
	add("{\"term\":\"adrenarche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07340239\"]}");
	add("{\"term\":\"adrenergic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02684892\"]}");
	add("{\"term\":\"adrenocorticotrophin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05415456\"]}");
	add("{\"term\":\"adrenocorticotropin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05415456\"]}");
	add("{\"term\":\"adrenosterone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14772017\"]}");
	add("{\"term\":\"adrian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10828490\", \"11041338\"]}");
	add("{\"term\":\"adrianople\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08935884\"]}");
	add("{\"term\":\"adrianopolis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08935884\"]}");
	add("{\"term\":\"adriatic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09211280\"]}");
	add("{\"term\":\"adroitness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05650020\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }