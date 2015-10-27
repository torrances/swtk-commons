package org.swtk.commons.dict.wordnet.index.name.instance.c.a.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCARE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"care\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00268366\", \"00831039\", \"07520286\", \"07539768\", \"05623652\", \"00656128\"]}");
	add("{\"term\":\"careen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00348834\"]}");
	add("{\"term\":\"career\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00283457\", \"00584283\"]}");
	add("{\"term\":\"careerism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00414099\"]}");
	add("{\"term\":\"careerist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09914674\"]}");
	add("{\"term\":\"carefreeness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04679567\", \"07546254\"]}");
	add("{\"term\":\"carefulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04670851\", \"04671415\"]}");
	add("{\"term\":\"caregiver\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09915013\", \"10184702\"]}");
	add("{\"term\":\"carelessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00740568\", \"04672321\"]}");
	add("{\"term\":\"carelian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06970803\", \"09726142\"]}");
	add("{\"term\":\"caress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00145598\"]}");
	add("{\"term\":\"caressing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00855630\"]}");
	add("{\"term\":\"caret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06831461\"]}");
	add("{\"term\":\"caretaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09915354\", \"09915153\"]}");
	add("{\"term\":\"caretta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01666580\"]}");
	add("{\"term\":\"carew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10902188\"]}");
	add("{\"term\":\"carex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12172331\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }