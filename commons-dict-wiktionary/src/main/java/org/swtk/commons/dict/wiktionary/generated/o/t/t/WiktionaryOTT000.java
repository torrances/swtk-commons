package org.swtk.commons.dict.wiktionary.generated.o.t.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOTT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ottawa", "{\"term\":\"ottawa\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Ojibwe\"], \"text\":\"Said to be from Ojibwe \u0027odaawaa\u0027 (traders)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Algonquian people closely related to the Ojibwe; also spelt Ottowa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The Ottawa dialect of Ojibwe; also spelt Odawa or Odaawaa\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The capital of Canada, located in the province of Ontario\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The government of Canada\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, \u0026quot;[http://www.cbc.ca/news/canada/story/2005/03/23/car-emissions040323.html Ottawa, carmakers reach Kyoto deal]\u0026quot;, \u0027CBC News\u0027, 5 April 2005\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"New vehicles will cut emissions by 5.3 megatonnes by 2010 as part of \u0027\u0027Ottawa\u0027\u0027s plans to meet Canada\u0027s Kyoto targets\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, \u0026quot;[http://www.cbc.ca/news/canada/story/2006/10/04/literacy-cuts.html Literacy groups demand $17M back from Ottawa]\u0026quot;, \u0027CBC News\u0027, 4 October 2006\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Literacy groups across the country demanded Wednesday that \u0027\u0027Ottawa\u0027\u0027 put back the $17.7 million it cut from adult literacy programs last week\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, \u0026quot;[http://www.cbc.ca/news/canada/story/2008/06/10/afghanistan-aid.html Ottawa boosting aid to Afghanistan by $550 million]\u0026quot;, \u0027CBC News\u0027, 10 June 2008\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Ottawa\u0027\u0027 announced the mission in Afghanistan will have a greater focus on reconstruction, development and security training, with an increase in aid of more than a half a billion dollars\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A river flowing SE between Ontario and Quebec into the St. Lawrence River\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A city in Illinois\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"A town in Ohio\", \"priority\":13}]}, \"synonyms\":{}}");

	add("ottawan", "{\"term\":\"ottawan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Ottawa|an|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of Ottawa, the capital city of Canada\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }