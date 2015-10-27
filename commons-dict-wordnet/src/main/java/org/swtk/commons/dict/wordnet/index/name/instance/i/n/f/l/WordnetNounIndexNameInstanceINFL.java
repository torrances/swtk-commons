package org.swtk.commons.dict.wordnet.index.name.instance.i.n.f.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINFL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"inflaming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01264205\"]}");
	add("{\"term\":\"inflammability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04719844\"]}");
	add("{\"term\":\"inflammation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00379287\", \"01264205\", \"14060493\", \"14359944\"]}");
	add("{\"term\":\"inflater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03574674\"]}");
	add("{\"term\":\"inflation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00368106\", \"04825154\", \"07423855\", \"13520031\"]}");
	add("{\"term\":\"inflator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03574674\"]}");
	add("{\"term\":\"inflection\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07098150\", \"07381571\", \"07097924\", \"13825994\"]}");
	add("{\"term\":\"inflexibility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04667618\", \"05031259\"]}");
	add("{\"term\":\"inflexibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05031259\"]}");
	add("{\"term\":\"inflexion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13825994\"]}");
	add("{\"term\":\"infliction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05838383\", \"00746056\", \"01129944\"]}");
	add("{\"term\":\"infliximab\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03574837\", \"15054589\"]}");
	add("{\"term\":\"inflorescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11694783\", \"13460743\"]}");
	add("{\"term\":\"inflow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13520985\"]}");
	add("{\"term\":\"influence\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10481313\", \"11434722\", \"05700875\", \"00157901\", \"05201419\"]}");
	add("{\"term\":\"influenza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14145979\"]}");
	add("{\"term\":\"influx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13520985\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }