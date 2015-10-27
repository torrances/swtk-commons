package org.swtk.commons.dict.wordnet.index.name.instance.e.n.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENTE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"entebbe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09066031\"]}");
	add("{\"term\":\"entelea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12224922\"]}");
	add("{\"term\":\"entelechy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13978438\"]}");
	add("{\"term\":\"entellus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02491046\"]}");
	add("{\"term\":\"entente\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06785262\", \"08188891\"]}");
	add("{\"term\":\"enterics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01370413\"]}");
	add("{\"term\":\"entering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00049744\", \"07384725\"]}");
	add("{\"term\":\"enteritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14368402\"]}");
	add("{\"term\":\"enterobacteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01370413\"]}");
	add("{\"term\":\"enterobacteriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01370071\"]}");
	add("{\"term\":\"enterobiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14199854\"]}");
	add("{\"term\":\"enterobius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01934039\"]}");
	add("{\"term\":\"enteroceptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05307186\"]}");
	add("{\"term\":\"enterokinase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14874360\"]}");
	add("{\"term\":\"enterolith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09296587\"]}");
	add("{\"term\":\"enterolithiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14138833\"]}");
	add("{\"term\":\"enterolobium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11781476\"]}");
	add("{\"term\":\"enteron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05540274\"]}");
	add("{\"term\":\"enteropathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14098088\"]}");
	add("{\"term\":\"enteroptosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14117073\"]}");
	add("{\"term\":\"enterostenosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14130209\"]}");
	add("{\"term\":\"enterostomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00672265\"]}");
	add("{\"term\":\"enterotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00672265\"]}");
	add("{\"term\":\"enterotoxemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14288019\"]}");
	add("{\"term\":\"enterotoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15060264\"]}");
	add("{\"term\":\"enterovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01340556\"]}");
	add("{\"term\":\"enterprise\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04843305\", \"08072983\", \"00798547\"]}");
	add("{\"term\":\"enterpriser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10080160\"]}");
	add("{\"term\":\"enterprisingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04843305\"]}");
	add("{\"term\":\"entertainer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09639952\"]}");
	add("{\"term\":\"entertainment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00430033\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }