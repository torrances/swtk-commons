package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alvar aalto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10826297\"]}");
	add("{\"term\":\"alveolar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07130201\"]}");
	add("{\"term\":\"alveolar arch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05317731\"]}");
	add("{\"term\":\"alveolar artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05342858\"]}");
	add("{\"term\":\"alveolar bed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05395185\"]}");
	add("{\"term\":\"alveolar consonant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07130201\"]}");
	add("{\"term\":\"alveolar ectasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14087778\"]}");
	add("{\"term\":\"alveolar point\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05242241\"]}");
	add("{\"term\":\"alveolar process\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05317876\"]}");
	add("{\"term\":\"alveolar resorption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14104606\"]}");
	add("{\"term\":\"alveolar rhabdomyosarcoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14269240\"]}");
	add("{\"term\":\"alveolar rhabdosarcoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14269240\"]}");
	add("{\"term\":\"alveolar ridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05317876\"]}");
	add("{\"term\":\"alveolitis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14281281\", \"14281495\"]}");
	add("{\"term\":\"alveolus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05292979\", \"05536028\"]}");
	add("{\"term\":\"alvin ailey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10830275\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }