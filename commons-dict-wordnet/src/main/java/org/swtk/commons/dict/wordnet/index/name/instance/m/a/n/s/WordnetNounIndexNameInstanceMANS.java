package org.swtk.commons.dict.wordnet.index.name.instance.m.a.n.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMANS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mansard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03724328\"]}");
	add("{\"term\":\"mansart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11174345\"]}");
	add("{\"term\":\"manse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03724474\", \"03724592\"]}");
	add("{\"term\":\"manservant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10311853\"]}");
	add("{\"term\":\"mansfield\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09154004\", \"11174479\"]}");
	add("{\"term\":\"mansi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06971880\", \"09727514\"]}");
	add("{\"term\":\"mansion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03724592\", \"08703415\"]}");
	add("{\"term\":\"manslaughter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00221276\"]}");
	add("{\"term\":\"manslayer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358420\"]}");
	add("{\"term\":\"manson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11174636\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }