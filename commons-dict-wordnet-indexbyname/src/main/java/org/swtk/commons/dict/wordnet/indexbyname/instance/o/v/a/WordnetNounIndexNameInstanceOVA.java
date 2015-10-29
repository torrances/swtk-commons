package org.swtk.commons.dict.wordnet.indexbyname.instance.o.v.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOVA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oval\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13900945\"]}");
	add("{\"term\":\"oval kumquat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12734281\"]}");
	add("{\"term\":\"oval office\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03868051\"]}");
	add("{\"term\":\"oval window\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05333154\"]}");
	add("{\"term\":\"ovalbumin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07857013\"]}");
	add("{\"term\":\"ovalipes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01982036\"]}");
	add("{\"term\":\"ovalipes ocellatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01982167\"]}");
	add("{\"term\":\"ovarian artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05360618\"]}");
	add("{\"term\":\"ovarian cyst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14225899\"]}");
	add("{\"term\":\"ovarian pregnancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14071029\"]}");
	add("{\"term\":\"ovarian vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05382873\"]}");
	add("{\"term\":\"ovariectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00687823\"]}");
	add("{\"term\":\"ovaritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14375400\"]}");
	add("{\"term\":\"ovary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05522938\", \"11699086\"]}");
	add("{\"term\":\"ovate leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13180053\"]}");
	add("{\"term\":\"ovation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06701496\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }