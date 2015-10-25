package org.swtk.commons.dict.wiktionary.generated.p.l.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPLO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ploc", "{\"term\":\"ploc\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"French\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A mixture of hair and tar for covering the bottom of a ship\", \"priority\":1}]}, \"synonyms\":{}}");

	add("plov", "{\"term\":\"plov\", \"etymology\":{\"influencers\":[], \"languages\":[\"Danish\", \"old norse\"], \"text\":\"From Old danish \u0027plogh\u0027 from Old norse \u0027plógr\u0027 (plough) from Proto-germanic {{m|gem-pro|*plōgaz}}, {{m|gem-pro|*plōguz||plough}}. Compare Swedish and Norwegian \u0027plog\u0027 Icelandic \u0027plógur\u0027 English \u0027plough\u0027 West Frisian \u0027ploech\u0027 Low German \u0027ploog\u0027 Dutch \u0027ploeg\u0027 German \u0027pflug\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"pilaf, in Uzbek cuisine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ploidy", "{\"term\":\"ploidy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the ending of words such as \u0027\u0027 \u0027\u0027 etc.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The number of homologous sets of chromosomes in a cell\", \"priority\":1}]}, \"synonyms\":{}}");

	add("plonker", "{\"term\":\"plonker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|plonk|er|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fool\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A penis\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A man who sanctions sexual relationships between his girlfriend and his male friends.\u0026lt;ref\u0026gt;[https://web.archive.org/web/20110209033439/http://www.bbc.co.uk/history/programmes/wordhunt/newresults.shtml BBC History- The Wordhunt]Wordhunters noticed that the OED\u0027s earliest two quotations in their entry for \u0027plonker\u0027 were misplaced. In the original 1966 citation from All Neat in Black Stockings by J Gaskell, the word refers not to a \u0027foolish, inept or contemptible person\u0027, but to a wholly different sense of the word, meaning \u0027a man who sanctions sexual relationships between his girlfriend and his male friends\u0027.\u0026lt;/ref\u0026gt\", \"priority\":3}]}, \"synonyms\":{}}");

	add("plosive", "{\"term\":\"plosive\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{m|en|explosive}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Sound produced from opening a previously closed oral passage; for example, when pronouncing the sound /p/ in \u0026quot;pug\u0026quot\", \"priority\":1}]}, \"synonyms\":{}}");

	add("plotline", "{\"term\":\"plotline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|plot|line|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The basic plot of a story or group of storie\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A group of stories sharing a plot\", \"priority\":2}]}, \"synonyms\":{}}");

	add("plotter", "{\"term\":\"plotter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who plots\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an output device that draws graphs and other pictorial images on paper, sometimes using attached pens\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An instrument used to mark or find the position of a vessel on a chart\", \"priority\":3}]}, \"synonyms\":{}}");

	add("plover", "{\"term\":\"plover\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"anglo-norman\"], \"text\":\"From Anglo-norman \u0027plover\u0027 \u0027pluvier\u0027 Old french (842-ca. 1400) \u0027plovier\u0027 from \u0027plovarius\u0027 \u0027pluviārius\u0027, of disputed origin; perhaps from Latin \u0027pluvia\u0027 (rain)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"File:Plover at Vandenberg thumb|plove\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any of various wading birds of the family Charadriidae\", \"priority\":2}]}, \"synonyms\":{}}");

	add("plowboy", "{\"term\":\"plowboy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|plow|boy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A boy plower, a boy who plows\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A knave who helps the plowman by driving the draught animals in front of the plow\", \"priority\":2}]}, \"synonyms\":{}}");

	add("plowman", "{\"term\":\"plowman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A male plower, who plows land with a plough\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A cereal breeder\u0027s farmhands must be good \u0027\u0027plowmen\", \"priority\":2}]}, \"synonyms\":{}}");

	add("plowwoman", "{\"term\":\"plowwoman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A female plower, who plows land with a plow\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A cereal breeder\u0027s farmhands must be good \u0027\u0027plowmen\u0027\u0027 and \u0027\u0027plowwomen\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }