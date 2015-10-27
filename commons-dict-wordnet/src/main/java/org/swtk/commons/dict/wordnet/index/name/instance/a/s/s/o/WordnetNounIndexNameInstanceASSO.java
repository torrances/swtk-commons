package org.swtk.commons.dict.wordnet.index.name.instance.a.s.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASSO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"associability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04695407\"]}");
	add("{\"term\":\"associableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04695407\"]}");
	add("{\"term\":\"associate\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06710466\", \"07299553\", \"09836579\", \"09965384\", \"09836176\"]}");
	add("{\"term\":\"associateship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00590140\"]}");
	add("{\"term\":\"association\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"08006819\", \"13456325\", \"13804981\", \"13953418\", \"05771913\", \"14444543\", \"01083552\", \"08066153\"]}");
	add("{\"term\":\"associationism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06147369\"]}");
	add("{\"term\":\"assonance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07112012\"]}");
	add("{\"term\":\"assortment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01014654\", \"08415730\"]}");
	add("{\"term\":\"assouan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08918684\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }