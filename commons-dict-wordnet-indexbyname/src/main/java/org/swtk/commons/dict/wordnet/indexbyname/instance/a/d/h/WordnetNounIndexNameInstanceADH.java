package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05421490\"]}");
	add("{\"term\":\"adhd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14079762\"]}");
	add("{\"term\":\"adherence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04942705\", \"01215372\"]}");
	add("{\"term\":\"adherent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10035803\"]}");
	add("{\"term\":\"adhesion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01215372\", \"04942705\", \"05591658\", \"14229706\"]}");
	add("{\"term\":\"adhesion contract\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06533869\"]}");
	add("{\"term\":\"adhesive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14726577\"]}");
	add("{\"term\":\"adhesive agent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14726577\"]}");
	add("{\"term\":\"adhesive bandage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02682964\"]}");
	add("{\"term\":\"adhesive friction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11480680\"]}");
	add("{\"term\":\"adhesive material\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14726577\"]}");
	add("{\"term\":\"adhesive plaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03963714\"]}");
	add("{\"term\":\"adhesive tape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02683191\"]}");
	add("{\"term\":\"adhesiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04942705\"]}");
	add("{\"term\":\"adhocracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08025971\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }