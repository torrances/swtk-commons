package org.swtk.commons.dict.wordnet.index.name.instance.a.d.h.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADHE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adherence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04942705\", \"01215372\"]}");
	add("{\"term\":\"adherent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10035803\"]}");
	add("{\"term\":\"adhesion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01215372\", \"04942705\", \"05591658\", \"14229706\"]}");
	add("{\"term\":\"adhesive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14726577\"]}");
	add("{\"term\":\"adhesiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04942705\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }