package org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lazar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10274367\"]}");
	add("{\"term\":\"lazar house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656129\"]}");
	add("{\"term\":\"lazaret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656129\"]}");
	add("{\"term\":\"lazarette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656129\"]}");
	add("{\"term\":\"lazaretto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03445800\", \"03656129\"]}");
	add("{\"term\":\"lazarus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10270699\", \"10270822\"]}");
	add("{\"term\":\"laziness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00760148\", \"01066537\", \"04644465\"]}");
	add("{\"term\":\"lazio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08824587\"]}");
	add("{\"term\":\"lazuli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14953935\"]}");
	add("{\"term\":\"lazuline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04976419\"]}");
	add("{\"term\":\"lazy daisy stitch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03656299\"]}");
	add("{\"term\":\"lazy susan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04509132\"]}");
	add("{\"term\":\"lazybones\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10271026\"]}");
	add("{\"term\":\"lazzaro spallanzani\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11329444\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }