package org.swtk.commons.dict.wordnet.index.name.instance.l.e.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"leucadendron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12240764\"]}");
	add("{\"term\":\"leucaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14266404\"]}");
	add("{\"term\":\"leucaena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11782706\"]}");
	add("{\"term\":\"leucanthemum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12010105\"]}");
	add("{\"term\":\"leucine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14959266\"]}");
	add("{\"term\":\"leuciscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01443590\"]}");
	add("{\"term\":\"leucocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05457535\"]}");
	add("{\"term\":\"leucocytosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14219703\"]}");
	add("{\"term\":\"leucocytozoan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01427864\"]}");
	add("{\"term\":\"leucocytozoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01427864\"]}");
	add("{\"term\":\"leucogenes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12011273\"]}");
	add("{\"term\":\"leucoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14281065\"]}");
	add("{\"term\":\"leucopenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14219887\"]}");
	add("{\"term\":\"leucorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05425165\"]}");
	add("{\"term\":\"leucothoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12260164\"]}");
	add("{\"term\":\"leucotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00685381\"]}");
	add("{\"term\":\"leuctra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01286246\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }