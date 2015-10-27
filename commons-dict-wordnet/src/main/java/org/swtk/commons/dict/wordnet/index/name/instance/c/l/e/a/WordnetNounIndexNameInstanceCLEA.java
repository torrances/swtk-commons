package org.swtk.commons.dict.wordnet.index.name.instance.c.l.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00628078\"]}");
	add("{\"term\":\"cleaner\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09946547\", \"09946763\", \"03044572\"]}");
	add("{\"term\":\"cleaners\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03043812\"]}");
	add("{\"term\":\"cleaning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00251880\"]}");
	add("{\"term\":\"cleanliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04903356\", \"14520035\"]}");
	add("{\"term\":\"cleanness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14013874\", \"14519777\"]}");
	add("{\"term\":\"cleanser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03044572\"]}");
	add("{\"term\":\"cleansing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00251880\"]}");
	add("{\"term\":\"cleanthes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10920118\"]}");
	add("{\"term\":\"cleanup\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00251880\", \"06498242\", \"13280696\"]}");
	add("{\"term\":\"clear\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08649998\", \"14013987\"]}");
	add("{\"term\":\"clearance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01143914\", \"13800473\", \"05097318\"]}");
	add("{\"term\":\"clearcutness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04828682\"]}");
	add("{\"term\":\"clearing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00265035\", \"01250194\", \"08558851\"]}");
	add("{\"term\":\"clearness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04708808\", \"04827489\"]}");
	add("{\"term\":\"clearstory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03045795\"]}");
	add("{\"term\":\"clearway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03044821\"]}");
	add("{\"term\":\"clearweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12415585\"]}");
	add("{\"term\":\"cleat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03044968\", \"03045099\", \"03045250\"]}");
	add("{\"term\":\"cleats\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03045434\"]}");
	add("{\"term\":\"cleavage\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00387153\", \"05561530\", \"13470329\", \"13470492\", \"13943045\"]}");
	add("{\"term\":\"cleaver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03045617\"]}");
	add("{\"term\":\"cleavers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12686920\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }