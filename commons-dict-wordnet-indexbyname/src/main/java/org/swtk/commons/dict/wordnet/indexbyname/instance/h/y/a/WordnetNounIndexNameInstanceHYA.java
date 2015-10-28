package org.swtk.commons.dict.wordnet.indexbyname.instance.h.y.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHYA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hyacinth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12478888\", \"14933735\"]}");
	add("{\"term\":\"hyacinthaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12478507\"]}");
	add("{\"term\":\"hyacinthoides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12479553\"]}");
	add("{\"term\":\"hyades\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09572545\"]}");
	add("{\"term\":\"hyaena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02119787\"]}");
	add("{\"term\":\"hyaenidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02119611\"]}");
	add("{\"term\":\"hyalin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14933854\"]}");
	add("{\"term\":\"hyaline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14933854\"]}");
	add("{\"term\":\"hyalinisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14100291\"]}");
	add("{\"term\":\"hyalinization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14100291\"]}");
	add("{\"term\":\"hyaloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05327138\"]}");
	add("{\"term\":\"hyalophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02305819\"]}");
	add("{\"term\":\"hyaloplasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05441629\"]}");
	add("{\"term\":\"hyalosperma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12004208\"]}");
	add("{\"term\":\"hyalospongiae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01910136\"]}");
	add("{\"term\":\"hyaluronidase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14934316\"]}");
	add("{\"term\":\"hyazyme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14934316\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }