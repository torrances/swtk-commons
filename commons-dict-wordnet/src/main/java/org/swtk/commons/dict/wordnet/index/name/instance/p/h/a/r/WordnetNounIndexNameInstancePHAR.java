package org.swtk.commons.dict.wordnet.index.name.instance.p.h.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pharaoh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10440761\"]}");
	add("{\"term\":\"pharisee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10440928\", \"10441084\"]}");
	add("{\"term\":\"pharma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08019020\"]}");
	add("{\"term\":\"pharmaceutic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03927111\"]}");
	add("{\"term\":\"pharmaceutical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03927111\"]}");
	add("{\"term\":\"pharmaceutics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06064831\"]}");
	add("{\"term\":\"pharmacist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10441215\"]}");
	add("{\"term\":\"pharmacogenetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06088797\"]}");
	add("{\"term\":\"pharmacokinetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06065060\"]}");
	add("{\"term\":\"pharmacologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10441498\"]}");
	add("{\"term\":\"pharmacology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06064423\"]}");
	add("{\"term\":\"pharmacopeia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06423526\"]}");
	add("{\"term\":\"pharmacopoeia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03927331\"]}");
	add("{\"term\":\"pharmacy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03254045\", \"06064831\"]}");
	add("{\"term\":\"pharomacrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01847055\"]}");
	add("{\"term\":\"pharos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02817995\"]}");
	add("{\"term\":\"pharsalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01293204\"]}");
	add("{\"term\":\"pharyngeal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134884\"]}");
	add("{\"term\":\"pharyngitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14196966\"]}");
	add("{\"term\":\"pharynx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05555141\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }