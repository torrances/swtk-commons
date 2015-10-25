package org.swtk.commons.dict.wiktionary.generated.u.r.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryURU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("urus", "{\"term\":\"urus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin Latin|ūrus\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The aurochs\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1819\u0027\u0027: He also brought forth two large drinking cups, made out of the horn of the \u0027\u0027urus\u0027\u0027, and hooped with silver. — Walter Scott, \u0027Ivanhoe\", \"priority\":2}]}, \"synonyms\":{}}");

	add("urucum", "{\"term\":\"urucum\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Achiote\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, William Bryant, \u0027The Birds of Paradise: Alfred Russel Wallace: a Life\u0027, p. 67\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Martius found most dressed in bits of clothing, their hair wildly tangled and their faces dyed red with \u0027\u0027urucum\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, \u0027Language: The Cultural Tool\u0027, Profile 2013, p. 122\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"They paint them, or at least parts of them, with \u0027\u0027urucum\u0027\u0027 (reddish) plant dye or even their own blood if there are no \u0027\u0027urucum\u0027\u0027 plants nearby\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Uchoa \u0027et al.\u0027, ‘Antioxidant Properties of Singlet Oxygen Suppressors’, in \u0027Natural Antioxidants and Biocides from Wild Medicinal Plants\u0027, p. 78\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Bixin results from lycopene oxidation and it is the main carotenoid found in the seed coat of \u0027\u0027urucum\u0027\u0027 fruits (\u0027Bixa orellana L.\u0027), which is cultivated in tropical countries of South and Central America, Africa and Asia\", \"priority\":7}]}, \"synonyms\":{}}");

	add("uruguay", "{\"term\":\"uruguay\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Guaraní\"], \"text\":\"Disputed; Guaraní \u0027urugua|lang\u003dgn\u0027 () \u0027i|lang\u003dgn\u0027 () or \u0027uru|lang\u003dgn\u0027 () \u0027gua|lang\u003dgn\u0027 () \u0027i|lang\u003dgn\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a country in South America. Official name: Oriental Republic of Uruguay\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uruguayan", "{\"term\":\"uruguayan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person from Uruguay or of Uruguayan descent\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ürümqi", "{\"term\":\"ürümqi\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Capital of Xinjiang Uyghur Autonomous Region (or simply Xinjiang) of the People’s Republic of China\", \"priority\":1}]}, \"synonyms\":{}}");

	add("urushiol", "{\"term\":\"urushiol\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027うるし|tr\u003durushi\u0027 (lacquer) {{suffix||ol|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An oil found in plants of the family \u0027Anacardiaceae\u0027, causing an allergic skin rash on contact; consists of a variable mixture of several organic compounds\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1986\u0027\u0027, Francine Brown, \u0027Skin Care\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"All three produce an oil, called \u0027\u0027urushiol\u0027\u0027, that is a potent allergen. Urushiol is most abundant in the leaves and stems of these plants\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1993\u0027\u0027, Jacquelyn G. Black, \u0027Microbiology: principles and applications\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Poison ivy vines also contain the irritating oil \u0027\u0027urushiol\u0027\u0027, so it is important to be able to recognize them in winter\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, C. Franklin Goldsmith, Shannon E. G. Hamrick, H. James Hamrick, \u0027The Best Hikes of Pisgah National Forest\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Upon exposure to air, \u0027\u0027urushiol\u0027\u0027 can turn dark brown, which makes it easier to spot\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }