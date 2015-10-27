package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMARK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mark\", \"synsetCount\":15, \"upperType\":\"NOUN\", \"ids\":[\"00065609\", \"04688744\", \"04701248\", \"06453473\", \"06659006\", \"06830640\", \"09940867\", \"11176933\", \"13710138\", \"06807523\", \"04683421\", \"06811608\", \"07276776\", \"07284884\", \"05745098\"]}");
	add("{\"term\":\"marker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03727498\", \"07284884\", \"03727288\"]}");
	add("{\"term\":\"market\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03727779\", \"08089673\", \"03466317\", \"08441908\", \"01099197\"]}");
	add("{\"term\":\"marketer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10596736\"]}");
	add("{\"term\":\"marketing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00082901\", \"01114325\", \"01115160\"]}");
	add("{\"term\":\"marketplace\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03727779\", \"01099197\"]}");
	add("{\"term\":\"markhoor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02420431\"]}");
	add("{\"term\":\"markhor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02420431\"]}");
	add("{\"term\":\"marking\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00264485\", \"00876655\", \"04687642\", \"07284884\"]}");
	add("{\"term\":\"markka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13710552\"]}");
	add("{\"term\":\"markoff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11177265\"]}");
	add("{\"term\":\"markov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11177265\"]}");
	add("{\"term\":\"markova\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11177130\"]}");
	add("{\"term\":\"marks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11177412\"]}");
	add("{\"term\":\"marksman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10314614\"]}");
	add("{\"term\":\"marksmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05646451\"]}");
	add("{\"term\":\"markup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06800459\", \"13324902\"]}");
	add("{\"term\":\"markweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12787629\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }