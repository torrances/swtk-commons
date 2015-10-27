package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clash\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00961487\", \"14004756\", \"14004622\", \"07394744\"]}");
	add("{\"term\":\"clasp\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00814187\", \"03042266\"]}");
	add("{\"term\":\"class\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04822408\", \"08120743\", \"08255581\", \"08256729\", \"00886144\", \"07990472\", \"08255384\", \"08014145\"]}");
	add("{\"term\":\"classic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09945884\", \"03042580\"]}");
	add("{\"term\":\"classical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07039369\"]}");
	add("{\"term\":\"classicalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06164248\"]}");
	add("{\"term\":\"classicism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06164248\"]}");
	add("{\"term\":\"classicist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09946114\", \"09945977\"]}");
	add("{\"term\":\"classics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06180087\"]}");
	add("{\"term\":\"classification\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01151399\", \"05740701\", \"07955878\", \"01014654\"]}");
	add("{\"term\":\"classified\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07264253\"]}");
	add("{\"term\":\"classifier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06319426\", \"09946320\"]}");
	add("{\"term\":\"classmate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10579534\"]}");
	add("{\"term\":\"classroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03042670\"]}");
	add("{\"term\":\"classwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00730273\"]}");
	add("{\"term\":\"clast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09269040\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }