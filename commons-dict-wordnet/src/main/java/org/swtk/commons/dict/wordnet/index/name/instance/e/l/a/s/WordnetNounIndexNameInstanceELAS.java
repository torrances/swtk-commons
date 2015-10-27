package org.swtk.commons.dict.wordnet.index.name.instance.e.l.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"elasmobranch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01484712\"]}");
	add("{\"term\":\"elasmobranchii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01484240\"]}");
	add("{\"term\":\"elastance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11453812\"]}");
	add("{\"term\":\"elastase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14873710\"]}");
	add("{\"term\":\"elastic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03272607\", \"04123192\"]}");
	add("{\"term\":\"elasticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05027524\"]}");
	add("{\"term\":\"elastin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05295230\"]}");
	add("{\"term\":\"elastomer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14864753\"]}");
	add("{\"term\":\"elastoplast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03273053\"]}");
	add("{\"term\":\"elastosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14058984\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }