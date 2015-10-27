package org.swtk.commons.dict.wordnet.index.name.instance.a.r.t.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARTI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"artichoke\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07734492\", \"11980101\"]}");
	add("{\"term\":\"article\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06335662\", \"06404578\", \"00023083\", \"06278749\"]}");
	add("{\"term\":\"articulateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04658552\"]}");
	add("{\"term\":\"articulatio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05602838\"]}");
	add("{\"term\":\"articulation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00148134\", \"05602838\", \"07087248\", \"13934166\", \"07146562\"]}");
	add("{\"term\":\"articulator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05308891\", \"09831117\"]}");
	add("{\"term\":\"artifact\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00022119\"]}");
	add("{\"term\":\"artifice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00173419\"]}");
	add("{\"term\":\"artificer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09828217\", \"09994178\", \"10234307\"]}");
	add("{\"term\":\"artificiality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04795722\"]}");
	add("{\"term\":\"artillery\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07261592\", \"08406028\", \"02749370\"]}");
	add("{\"term\":\"artilleryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09831257\"]}");
	add("{\"term\":\"artiodactyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02397129\"]}");
	add("{\"term\":\"artiodactyla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02396720\"]}");
	add("{\"term\":\"artisan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09994178\"]}");
	add("{\"term\":\"artist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09831743\"]}");
	add("{\"term\":\"artiste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09832531\"]}");
	add("{\"term\":\"artistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05646832\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }