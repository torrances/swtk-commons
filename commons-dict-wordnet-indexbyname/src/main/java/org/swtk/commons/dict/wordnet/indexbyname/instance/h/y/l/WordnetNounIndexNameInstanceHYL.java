package org.swtk.commons.dict.wordnet.indexbyname.instance.h.y.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHYL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hyla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01653150\"]}");
	add("{\"term\":\"hyla arenicolor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01653700\"]}");
	add("{\"term\":\"hyla crucifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01653331\"]}");
	add("{\"term\":\"hyla regilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01653542\"]}");
	add("{\"term\":\"hylactophryne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01646015\"]}");
	add("{\"term\":\"hylactophryne augusti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01646148\"]}");
	add("{\"term\":\"hylidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01652589\"]}");
	add("{\"term\":\"hylobates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02485855\"]}");
	add("{\"term\":\"hylobates lar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02485993\"]}");
	add("{\"term\":\"hylobates syndactylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02486339\"]}");
	add("{\"term\":\"hylobatidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02485451\"]}");
	add("{\"term\":\"hylocereus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11868722\"]}");
	add("{\"term\":\"hylocichla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01561935\"]}");
	add("{\"term\":\"hylocichla fuscescens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01562280\"]}");
	add("{\"term\":\"hylocichla guttata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01562118\"]}");
	add("{\"term\":\"hylocichla mustelina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01562445\"]}");
	add("{\"term\":\"hylophylax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01556520\"]}");
	add("{\"term\":\"hylophylax naevioides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01556658\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }