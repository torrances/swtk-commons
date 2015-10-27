package org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePREC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"precambrian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15153663\"]}");
	add("{\"term\":\"precariousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04764142\", \"04863852\"]}");
	add("{\"term\":\"precaution\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05623652\", \"04671671\", \"00824631\"]}");
	add("{\"term\":\"precava\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05430439\"]}");
	add("{\"term\":\"precedence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01259825\", \"05054430\", \"13973020\"]}");
	add("{\"term\":\"precedency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01259825\", \"05054430\", \"13973020\"]}");
	add("{\"term\":\"precedent\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06612635\", \"08470733\", \"06547026\", \"05829846\"]}");
	add("{\"term\":\"precentor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09939229\"]}");
	add("{\"term\":\"precentorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00597405\"]}");
	add("{\"term\":\"precept\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06195690\", \"06668133\"]}");
	add("{\"term\":\"preceptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10484108\"]}");
	add("{\"term\":\"preceptorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00597508\"]}");
	add("{\"term\":\"precession\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01259825\", \"14029213\"]}");
	add("{\"term\":\"prechlorination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13561294\"]}");
	add("{\"term\":\"precinct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08555989\"]}");
	add("{\"term\":\"preciosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04795560\"]}");
	add("{\"term\":\"preciousness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04795560\", \"05148469\", \"05153519\"]}");
	add("{\"term\":\"precipice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09421552\"]}");
	add("{\"term\":\"precipitance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05067645\"]}");
	add("{\"term\":\"precipitancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05067645\"]}");
	add("{\"term\":\"precipitant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15021960\"]}");
	add("{\"term\":\"precipitate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14615815\"]}");
	add("{\"term\":\"precipitateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05067645\"]}");
	add("{\"term\":\"precipitation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05067358\", \"05068318\", \"07448920\", \"11515038\", \"13561402\", \"13794793\"]}");
	add("{\"term\":\"precipitator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04005031\"]}");
	add("{\"term\":\"precipitin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15052329\"]}");
	add("{\"term\":\"precipitousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05067645\", \"05076793\"]}");
	add("{\"term\":\"precis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06480622\"]}");
	add("{\"term\":\"preciseness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04811129\", \"04828682\"]}");
	add("{\"term\":\"precision\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04811129\"]}");
	add("{\"term\":\"preclusion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01080966\"]}");
	add("{\"term\":\"precociousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05628077\"]}");
	add("{\"term\":\"precocity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05628077\"]}");
	add("{\"term\":\"precognition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07271600\"]}");
	add("{\"term\":\"preconception\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06211643\", \"05958804\"]}");
	add("{\"term\":\"precondition\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05901487\", \"05901963\", \"06768279\"]}");
	add("{\"term\":\"precordium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05500654\"]}");
	add("{\"term\":\"precursor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06815429\", \"09650305\", \"14607246\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }