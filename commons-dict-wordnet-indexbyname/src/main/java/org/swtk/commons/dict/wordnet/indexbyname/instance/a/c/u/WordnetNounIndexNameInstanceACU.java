package org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceACU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"acuity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05628251\", \"05663412\"]}");
	add("{\"term\":\"acular\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03617768\"]}");
	add("{\"term\":\"aculea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01903626\"]}");
	add("{\"term\":\"aculeus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01903732\", \"13110179\"]}");
	add("{\"term\":\"acumen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05629591\", \"13110286\"]}");
	add("{\"term\":\"acuminate leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13178582\"]}");
	add("{\"term\":\"acupressure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00711591\"]}");
	add("{\"term\":\"acupuncture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00711408\"]}");
	add("{\"term\":\"acute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06835460\"]}");
	add("{\"term\":\"acute accent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06835460\"]}");
	add("{\"term\":\"acute angle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13914630\"]}");
	add("{\"term\":\"acute anterior poliomyelitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14163658\"]}");
	add("{\"term\":\"acute brain disorder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14078244\"]}");
	add("{\"term\":\"acute gastritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14370011\"]}");
	add("{\"term\":\"acute glaucoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14279018\"]}");
	add("{\"term\":\"acute glossitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14370450\"]}");
	add("{\"term\":\"acute hemorrhagic encephalitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14366147\"]}");
	add("{\"term\":\"acute inclusion body encephalitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14366467\"]}");
	add("{\"term\":\"acute kidney failure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14138368\"]}");
	add("{\"term\":\"acute leukemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14266750\"]}");
	add("{\"term\":\"acute lymphoblastic leukemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14266875\"]}");
	add("{\"term\":\"acute lymphocytic leukemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14266875\"]}");
	add("{\"term\":\"acute myelocytic leukemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14267131\"]}");
	add("{\"term\":\"acute myeloid leukemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14267131\"]}");
	add("{\"term\":\"acute organic brain syndrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14078244\"]}");
	add("{\"term\":\"acute pyelonephritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14590057\"]}");
	add("{\"term\":\"acute renal failure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14138368\"]}");
	add("{\"term\":\"acute schizophrenic episode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14423729\"]}");
	add("{\"term\":\"acute triangle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13902473\"]}");
	add("{\"term\":\"acuteness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04712884\", \"05628251\", \"05661172\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }