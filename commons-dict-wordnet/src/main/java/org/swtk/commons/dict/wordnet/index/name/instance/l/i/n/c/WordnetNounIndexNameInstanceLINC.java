package org.swtk.commons.dict.wordnet.index.name.instance.l.i.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLINC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"linchpin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03675665\", \"05702197\"]}");
	add("{\"term\":\"lincocin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03675948\"]}");
	add("{\"term\":\"lincoln\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02416363\", \"09132519\", \"11152452\"]}");
	add("{\"term\":\"lincolnshire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08904418\"]}");
	add("{\"term\":\"lincomycin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03675948\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }