package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMARS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mars\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09578914\", \"09370342\"]}");
	add("{\"term\":\"marsala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07917595\"]}");
	add("{\"term\":\"marseillaise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07063245\"]}");
	add("{\"term\":\"marseille\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03729025\", \"08956606\"]}");
	add("{\"term\":\"marseilles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08956606\"]}");
	add("{\"term\":\"marsh\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11178523\", \"11178641\", \"09370676\"]}");
	add("{\"term\":\"marshal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10315837\", \"10315612\"]}");
	add("{\"term\":\"marshall\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10315612\", \"10315837\", \"11178744\", \"11178972\", \"11179204\"]}");
	add("{\"term\":\"marshals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08159370\"]}");
	add("{\"term\":\"marshalship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00596147\"]}");
	add("{\"term\":\"marshland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09370676\"]}");
	add("{\"term\":\"marshmallow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07623707\"]}");
	add("{\"term\":\"marsilea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12978227\"]}");
	add("{\"term\":\"marsileaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12978058\"]}");
	add("{\"term\":\"marstan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11179308\"]}");
	add("{\"term\":\"marsupial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01877075\"]}");
	add("{\"term\":\"marsupialia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01876767\"]}");
	add("{\"term\":\"marsupium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05524919\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }