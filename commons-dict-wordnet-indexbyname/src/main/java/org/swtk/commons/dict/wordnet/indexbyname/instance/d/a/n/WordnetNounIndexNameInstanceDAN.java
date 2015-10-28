package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09531941\"]}");
	add("{\"term\":\"danaea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13236697\"]}");
	add("{\"term\":\"danaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02282289\"]}");
	add("{\"term\":\"danaidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02282094\"]}");
	add("{\"term\":\"danau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09285993\"]}");
	add("{\"term\":\"danaus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02282471\"]}");
	add("{\"term\":\"dance\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07463317\", \"00429255\", \"08270062\", \"07033652\"]}");
	add("{\"term\":\"dancer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10009953\", \"10009040\"]}");
	add("{\"term\":\"dancing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00429255\"]}");
	add("{\"term\":\"dandelion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12044645\"]}");
	add("{\"term\":\"dander\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07533239\", \"09285704\"]}");
	add("{\"term\":\"dandruff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09285861\", \"14254689\"]}");
	add("{\"term\":\"dandy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04619730\", \"10010564\"]}");
	add("{\"term\":\"dandyism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04918025\"]}");
	add("{\"term\":\"dane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09719038\"]}");
	add("{\"term\":\"danewort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12699784\"]}");
	add("{\"term\":\"dangaleat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06998233\"]}");
	add("{\"term\":\"danger\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08661788\", \"14564646\", \"00803899\", \"14564367\"]}");
	add("{\"term\":\"dangerousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04863691\"]}");
	add("{\"term\":\"dangla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06998233\"]}");
	add("{\"term\":\"dangleberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12257494\"]}");
	add("{\"term\":\"dangling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01019643\"]}");
	add("{\"term\":\"daniel\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06450665\", \"10010823\", \"10941771\"]}");
	add("{\"term\":\"danish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07709335\", \"06966788\"]}");
	add("{\"term\":\"dankness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14559687\"]}");
	add("{\"term\":\"danmark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08779077\"]}");
	add("{\"term\":\"danseur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10010944\"]}");
	add("{\"term\":\"danseuse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09853980\"]}");
	add("{\"term\":\"dante\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10941991\"]}");
	add("{\"term\":\"danton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10942253\"]}");
	add("{\"term\":\"danu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09531941\"]}");
	add("{\"term\":\"danube\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09285993\"]}");
	add("{\"term\":\"danzig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09006112\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }