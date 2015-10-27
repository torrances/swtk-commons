package org.swtk.commons.dict.wordnet.index.name.instance.r.e.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"real\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13410750\", \"13690013\", \"13752012\"]}");
	add("{\"term\":\"realgar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14719071\"]}");
	add("{\"term\":\"realisation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00062737\", \"00933662\", \"00941859\", \"01121941\", \"05815548\", \"07052802\"]}");
	add("{\"term\":\"realism\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05983431\", \"08486468\", \"05984526\", \"13978747\", \"05159116\"]}");
	add("{\"term\":\"realist\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10528982\", \"10529198\", \"10528754\"]}");
	add("{\"term\":\"reality\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04769610\", \"13979383\", \"13978747\", \"05817904\"]}");
	add("{\"term\":\"realization\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00062737\", \"00941859\", \"01121941\", \"07052802\", \"00933662\", \"05815548\"]}");
	add("{\"term\":\"reallocation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01086104\", \"13310653\"]}");
	add("{\"term\":\"reallotment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01086104\"]}");
	add("{\"term\":\"realm\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06006992\", \"08575692\", \"14538407\"]}");
	add("{\"term\":\"realness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13978747\"]}");
	add("{\"term\":\"realpolitik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06158489\"]}");
	add("{\"term\":\"realtor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10529671\"]}");
	add("{\"term\":\"realty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13267374\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }