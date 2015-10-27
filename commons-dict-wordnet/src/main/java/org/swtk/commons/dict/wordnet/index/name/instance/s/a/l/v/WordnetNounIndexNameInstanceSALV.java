package org.swtk.commons.dict.wordnet.index.name.instance.s.a.l.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSALV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"salvador\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08756105\"]}");
	add("{\"term\":\"salvadora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12319942\"]}");
	add("{\"term\":\"salvadoraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12319682\"]}");
	add("{\"term\":\"salvadoran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09720219\"]}");
	add("{\"term\":\"salvadorean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09720219\"]}");
	add("{\"term\":\"salvadorian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09720219\"]}");
	add("{\"term\":\"salvage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00097031\", \"00097163\", \"13268453\"]}");
	add("{\"term\":\"salvager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10569067\"]}");
	add("{\"term\":\"salvation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00097333\", \"14562767\", \"00180229\", \"00094821\"]}");
	add("{\"term\":\"salve\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00260235\", \"03851070\"]}");
	add("{\"term\":\"salvelinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02540478\"]}");
	add("{\"term\":\"salver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04139012\"]}");
	add("{\"term\":\"salvia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12885305\"]}");
	add("{\"term\":\"salvinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12979681\"]}");
	add("{\"term\":\"salviniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12979532\"]}");
	add("{\"term\":\"salvinorin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04139139\"]}");
	add("{\"term\":\"salvo\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06705831\", \"00990406\", \"07449749\"]}");
	add("{\"term\":\"salvor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10569067\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }